package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 2.75f)
            curveTo(9f, 2.336f, 8.664f, 2f, 8.25f, 2f)
            horizontalLineToRelative(-5.5f)
            curveTo(2.336f, 2f, 2f, 2.336f, 2f, 2.75f)
            verticalLineToRelative(5.5f)
            curveTo(2f, 8.664f, 2.336f, 9f, 2.75f, 9f)
            reflectiveCurveTo(3.5f, 8.664f, 3.5f, 8.25f)
            verticalLineTo(4.56f)
            lineToRelative(9.22f, 9.22f)
            curveToRelative(0.292f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(4.56f, 3.5f)
            horizontalLineToRelative(3.69f)
            curveTo(8.664f, 3.5f, 9f, 3.164f, 9f, 2.75f)
            close()
        }
    }.build()
}
