package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceTentative24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceTentative24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.678f, 0.005f)
            curveTo(5.303f, 0.17f, 0.166f, 5.308f, 0f, 11.683f)
            lineTo(11.678f, 0.005f)
            close()
            moveTo(2.39f, 19.193f)
            curveToRelative(-0.746f, -0.995f, -1.341f, -2.11f, -1.751f, -3.31f)
            lineToRelative(15.24f, -15.24f)
            curveToRelative(1.2f, 0.41f, 2.315f, 1.005f, 3.31f, 1.751f)
            lineTo(2.39f, 19.194f)
            close()
            moveTo(23.356f, 8.125f)
            lineTo(8.12f, 23.36f)
            curveToRelative(-1.2f, -0.41f, -2.316f, -1.004f, -3.311f, -1.75f)
            lineTo(21.605f, 4.813f)
            curveToRelative(0.746f, 0.996f, 1.34f, 2.11f, 1.75f, 3.312f)
            close()
            moveToRelative(0.635f, 4.201f)
            lineToRelative(-11.67f, 11.67f)
            curveToRelative(6.37f, -0.17f, 11.5f, -5.301f, 11.67f, -11.67f)
            close()
        }
    }.build()
}
