package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Edit48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Edit48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(32.206f, 6.025f)
            curveToRelative(2.697f, -2.697f, 7.07f, -2.698f, 9.768f, 0f)
            curveToRelative(2.697f, 2.697f, 2.698f, 7.07f, 0f, 9.767f)
            lineTo(39.77f, 18f)
            lineTo(30f, 8.23f)
            lineToRelative(2.205f, -2.206f)
            close()
            moveTo(28.233f, 10f)
            lineTo(8.038f, 30.197f)
            curveToRelative(-0.762f, 0.762f, -1.305f, 1.714f, -1.572f, 2.758f)
            lineTo(4.039f, 42.44f)
            curveToRelative(-0.11f, 0.428f, 0.015f, 0.881f, 0.327f, 1.193f)
            curveToRelative(0.312f, 0.313f, 0.766f, 0.437f, 1.194f, 0.328f)
            lineToRelative(9.486f, -2.425f)
            curveToRelative(1.044f, -0.267f, 1.998f, -0.81f, 2.76f, -1.572f)
            lineToRelative(20.195f, -20.198f)
            lineTo(28.233f, 10f)
            close()
        }
    }.build()
}
