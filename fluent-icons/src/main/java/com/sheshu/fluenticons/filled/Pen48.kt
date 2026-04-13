package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pen48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pen48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(32.206f, 6.025f)
            curveToRelative(2.697f, -2.697f, 7.07f, -2.698f, 9.768f, 0f)
            curveToRelative(2.697f, 2.697f, 2.698f, 7.07f, 0f, 9.767f)
            lineToRelative(-2.234f, 2.236f)
            lineToRelative(0.935f, 0.998f)
            curveToRelative(1.57f, 1.673f, 1.527f, 4.29f, -0.095f, 5.912f)
            lineToRelative(-3.446f, 3.446f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            curveToRelative(-0.488f, -0.489f, -0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(3.446f, -3.446f)
            curveToRelative(0.668f, -0.668f, 0.685f, -1.746f, 0.04f, -2.435f)
            lineToRelative(-0.881f, -0.939f)
            lineToRelative(-20.165f, 20.168f)
            curveToRelative(-0.762f, 0.762f, -1.716f, 1.305f, -2.76f, 1.572f)
            lineTo(5.56f, 43.961f)
            curveToRelative(-0.428f, 0.109f, -0.882f, -0.015f, -1.194f, -0.328f)
            curveToRelative(-0.312f, -0.312f, -0.436f, -0.766f, -0.327f, -1.193f)
            lineToRelative(2.427f, -9.485f)
            curveToRelative(0.267f, -1.044f, 0.81f, -1.996f, 1.571f, -2.758f)
            lineToRelative(24.17f, -24.172f)
            close()
        }
    }.build()
}
