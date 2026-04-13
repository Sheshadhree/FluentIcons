package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Bookmark24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Bookmark24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(5.00244f, 4.61058f),
                end = Offset(15.3172f, 17.4907f)
            )
        ) {
            moveTo(6.19f, 21.854f)
            curveToRelative(-0.496f, 0.357f, -1.188f, 0.002f, -1.188f, -0.609f)
            verticalLineTo(6.25f)
            curveTo(5.002f, 4.454f, 6.457f, 3f, 8.252f, 3f)
            horizontalLineToRelative(7.499f)
            curveTo(17.546f, 3f, 19f, 4.454f, 19f, 6.25f)
            verticalLineToRelative(14.996f)
            curveToRelative(0f, 0.611f, -0.692f, 0.966f, -1.188f, 0.609f)
            lineToRelative(-5.811f, -4.181f)
            lineToRelative(-5.812f, 4.18f)
            close()
        }
    }.build()
}
