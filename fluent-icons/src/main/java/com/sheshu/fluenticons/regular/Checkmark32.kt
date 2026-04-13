package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Checkmark32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Checkmark32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(29.726f, 5.312f)
            curveToRelative(0.38f, 0.401f, 0.363f, 1.034f, -0.038f, 1.414f)
            lineToRelative(-19f, 18f)
            curveToRelative(-0.194f, 0.183f, -0.452f, 0.282f, -0.719f, 0.274f)
            curveToRelative(-0.266f, -0.009f, -0.518f, -0.123f, -0.7f, -0.318f)
            lineToRelative(-7f, -7.5f)
            curveToRelative(-0.377f, -0.403f, -0.355f, -1.036f, 0.049f, -1.413f)
            curveToRelative(0.403f, -0.377f, 1.036f, -0.355f, 1.413f, 0.049f)
            lineToRelative(6.313f, 6.763f)
            lineTo(28.312f, 5.274f)
            curveToRelative(0.401f, -0.38f, 1.034f, -0.363f, 1.414f, 0.038f)
            close()
        }
    }.build()
}
