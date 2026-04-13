package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.ArrowHookDownRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowHookDownRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.146f, 26.854f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(24.293f, 21f)
            horizontalLineTo(13f)
            curveToRelative(-3.866f, 0f, -7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            horizontalLineToRelative(9.5f)
            curveTo(22.776f, 7f, 23f, 7.224f, 23f, 7.5f)
            reflectiveCurveTo(22.776f, 8f, 22.5f, 8f)
            horizontalLineTo(13f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            horizontalLineToRelative(11.293f)
            lineToRelative(-5.147f, -5.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(6f, 6f)
            curveTo(25.947f, 20.24f, 26f, 20.367f, 26f, 20.5f)
            curveToRelative(0f, 0.133f, -0.053f, 0.26f, -0.146f, 0.354f)
            lineToRelative(-6f, 6f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            close()
        }
    }.build()
}
