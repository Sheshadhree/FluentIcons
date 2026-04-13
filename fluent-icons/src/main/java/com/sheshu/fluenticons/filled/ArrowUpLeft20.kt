package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3.75f)
            curveTo(12f, 3.336f, 11.664f, 3f, 11.25f, 3f)
            horizontalLineToRelative(-7.5f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineToRelative(7.5f)
            curveTo(3f, 11.664f, 3.336f, 12f, 3.75f, 12f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(5.56f)
            lineToRelative(11.219f, 11.22f)
            curveToRelative(0.293f, 0.292f, 0.767f, 0.292f, 1.06f, 0f)
            curveToRelative(0.293f, -0.294f, 0.293f, -0.769f, 0f, -1.062f)
            lineTo(5.561f, 4.5f)
            horizontalLineToRelative(5.689f)
            curveTo(11.664f, 4.5f, 12f, 4.164f, 12f, 3.75f)
            close()
        }
    }.build()
}
