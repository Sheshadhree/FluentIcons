package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowOutlineDownLeft48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowOutlineDownLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.038f, 38.156f)
            curveToRelative(-0.382f, 3.36f, 2.465f, 6.2f, 5.823f, 5.81f)
            lineToRelative(23.386f, -2.721f)
            curveToRelative(3.529f, -0.41f, 5.026f, -4.712f, 2.516f, -7.226f)
            lineToRelative(-2.75f, -2.751f)
            lineToRelative(9.453f, -9.452f)
            curveToRelative(2.048f, -2.049f, 2.05f, -5.37f, 0.003f, -7.421f)
            lineToRelative(-8.833f, -8.85f)
            curveToRelative(-2.05f, -2.052f, -5.376f, -2.054f, -7.427f, -0.003f)
            lineToRelative(-9.465f, 9.46f)
            lineToRelative(-2.843f, -2.787f)
            curveToRelative(-2.526f, -2.477f, -6.797f, -0.963f, -7.198f, 2.553f)
            lineTo(4.038f, 38.157f)
            close()
        }
    }.build()
}
