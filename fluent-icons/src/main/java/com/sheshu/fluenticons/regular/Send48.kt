package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Send48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Send48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.128f, 6.964f)
            curveToRelative(-0.62f, -1.899f, 1.358f, -3.604f, 3.145f, -2.71f)
            lineTo(42.756f, 21.99f)
            curveToRelative(1.66f, 0.83f, 1.66f, 3.196f, 0f, 4.025f)
            lineTo(7.274f, 43.752f)
            curveToRelative(-1.787f, 0.893f, -3.765f, -0.812f, -3.145f, -2.71f)
            lineToRelative(5.557f, -17.04f)
            lineTo(4.128f, 6.965f)
            close()
            moveToRelative(7.78f, 18.289f)
            lineTo(6.69f, 41.248f)
            lineToRelative(34.5f, -17.245f)
            lineTo(6.69f, 6.757f)
            lineToRelative(5.217f, 15.996f)
            horizontalLineTo(28.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(11.907f)
            close()
        }
    }.build()
}
