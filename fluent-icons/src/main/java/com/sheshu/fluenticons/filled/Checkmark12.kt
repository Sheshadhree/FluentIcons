package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Checkmark12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Checkmark12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.765f, 3.205f)
            curveToRelative(0.301f, 0.284f, 0.315f, 0.759f, 0.03f, 1.06f)
            lineToRelative(-4.25f, 4.5f)
            curveTo(5.406f, 8.912f, 5.213f, 8.997f, 5.011f, 9f)
            curveTo(4.808f, 9.003f, 4.613f, 8.924f, 4.47f, 8.78f)
            lineTo(2.22f, 6.53f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(1.705f, 1.704f)
            lineToRelative(3.72f, -3.939f)
            curveToRelative(0.284f, -0.301f, 0.759f, -0.315f, 1.06f, -0.03f)
            close()
        }
    }.build()
}
