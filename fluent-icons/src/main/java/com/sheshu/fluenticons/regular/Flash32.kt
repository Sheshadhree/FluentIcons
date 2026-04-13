package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Flash32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flash32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.103f, 3.368f)
            curveTo(10.375f, 2.55f, 11.139f, 2f, 12f, 2f)
            horizontalLineToRelative(9f)
            curveToRelative(0.656f, 0f, 1.27f, 0.322f, 1.644f, 0.86f)
            curveToRelative(0.373f, 0.54f, 0.459f, 1.228f, 0.229f, 1.842f)
            lineTo(20.886f, 10f)
            horizontalLineTo(24f)
            curveToRelative(0.775f, 0f, 1.48f, 0.448f, 1.81f, 1.15f)
            curveToRelative(0.33f, 0.7f, 0.225f, 1.53f, -0.27f, 2.126f)
            lineTo(12.473f, 29.047f)
            curveToRelative(-1.706f, 2.058f, -5.016f, 0.365f, -4.346f, -2.222f)
            lineTo(10.415f, 18f)
            horizontalLineTo(8f)
            curveToRelative(-0.643f, 0f, -1.247f, -0.309f, -1.622f, -0.83f)
            curveToRelative(-0.376f, -0.522f, -0.479f, -1.193f, -0.275f, -1.803f)
            lineToRelative(4f, -12f)
            close()
            moveTo(12f, 4f)
            lineTo(8f, 16f)
            horizontalLineToRelative(3.708f)
            curveToRelative(0.654f, 0f, 1.132f, 0.618f, 0.968f, 1.251f)
            lineToRelative(-2.613f, 10.076f)
            curveToRelative(-0.134f, 0.517f, 0.528f, 0.856f, 0.87f, 0.444f)
            lineTo(24f, 12f)
            horizontalLineToRelative(-4.557f)
            curveToRelative(-0.698f, 0f, -1.181f, -0.697f, -0.936f, -1.351f)
            lineTo(21f, 4f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
