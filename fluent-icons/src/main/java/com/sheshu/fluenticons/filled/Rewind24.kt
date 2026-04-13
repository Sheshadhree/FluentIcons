package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rewind24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rewind24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.03f, 4.362f)
            curveToRelative(0.974f, -0.83f, 2.472f, -0.137f, 2.472f, 1.142f)
            verticalLineToRelative(3.99f)
            lineToRelative(6.027f, -5.13f)
            curveToRelative(0.974f, -0.83f, 2.473f, -0.138f, 2.473f, 1.141f)
            verticalLineToRelative(12.993f)
            curveToRelative(0f, 0.879f, -0.707f, 1.48f, -1.465f, 1.503f)
            horizontalLineTo(19.45f)
            curveToRelative(-0.318f, -0.01f, -0.64f, -0.122f, -0.92f, -0.36f)
            lineToRelative(-6.028f, -5.13f)
            verticalLineToRelative(3.986f)
            curveToRelative(0f, 1.279f, -1.498f, 1.971f, -2.473f, 1.142f)
            lineToRelative(-7.41f, -6.306f)
            curveToRelative(-0.82f, -0.699f, -0.82f, -1.966f, 0f, -2.665f)
            lineToRelative(7.41f, -6.306f)
            close()
            moveToRelative(-7.41f, 6.306f)
            lineToRelative(0.486f, 0.57f)
            close()
        }
    }.build()
}
