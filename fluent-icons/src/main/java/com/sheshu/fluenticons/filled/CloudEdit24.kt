package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudEdit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudEdit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.08f, 9.02f)
            curveTo(6.548f, 6.171f, 9.02f, 4f, 12f, 4f)
            reflectiveCurveToRelative(5.452f, 2.172f, 5.92f, 5.02f)
            curveToRelative(0.92f, 0.085f, 1.758f, 0.446f, 2.433f, 1f)
            curveToRelative(-0.716f, 0.08f, -1.411f, 0.393f, -1.96f, 0.942f)
            lineToRelative(-5.903f, 5.903f)
            curveToRelative(-0.328f, 0.328f, -0.59f, 0.713f, -0.773f, 1.135f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveToRelative(0f, -2.344f, 1.792f, -4.269f, 4.08f, -4.48f)
            close()
            moveToRelative(13.02f, 2.65f)
            lineToRelative(-5.903f, 5.902f)
            curveToRelative(-0.344f, 0.344f, -0.588f, 0.775f, -0.706f, 1.247f)
            lineToRelative(-0.458f, 1.831f)
            curveToRelative(-0.199f, 0.796f, 0.523f, 1.517f, 1.319f, 1.318f)
            lineToRelative(1.83f, -0.457f)
            curveToRelative(0.473f, -0.118f, 0.904f, -0.363f, 1.248f, -0.707f)
            lineToRelative(5.902f, -5.902f)
            curveToRelative(0.893f, -0.893f, 0.893f, -2.34f, 0f, -3.232f)
            curveToRelative(-0.892f, -0.893f, -2.34f, -0.893f, -3.232f, 0f)
            close()
        }
    }.build()
}
