package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Bookmark28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Bookmark28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(6f, 5.36607f),
                end = Offset(17.9784f, 20.1289f)
            )
        ) {
            moveTo(9.25f, 3.5f)
            curveTo(7.455f, 3.5f, 6f, 4.955f, 6f, 6.75f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 0.285f, 0.161f, 0.545f, 0.416f, 0.672f)
            curveToRelative(0.255f, 0.126f, 0.56f, 0.098f, 0.787f, -0.075f)
            lineTo(14f, 20.192f)
            lineToRelative(6.797f, 5.157f)
            curveToRelative(0.227f, 0.172f, 0.531f, 0.2f, 0.787f, 0.074f)
            curveTo(21.839f, 25.295f, 22f, 25.035f, 22f, 24.75f)
            verticalLineToRelative(-18f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineToRelative(-9.5f)
            close()
        }
    }.build()
}
