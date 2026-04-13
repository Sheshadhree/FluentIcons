package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Options24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Options24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.75f, 13.5f)
            curveToRelative(1.537f, 0f, 2.825f, 1.067f, 3.163f, 2.5f)
            horizontalLineToRelative(9.337f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(21.25f, 17.5f)
            horizontalLineToRelative(-9.337f)
            curveTo(11.574f, 18.935f, 10.287f, 20f, 8.75f, 20f)
            reflectiveCurveToRelative(-2.824f, -1.066f, -3.163f, -2.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 17.5f, 2f, 17.164f, 2f, 16.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(2.75f, 16f)
            horizontalLineToRelative(2.837f)
            curveToRelative(0.338f, -1.433f, 1.626f, -2.5f, 3.163f, -2.5f)
            close()
            moveToRelative(6.5f, -9.5f)
            curveToRelative(1.537f, 0f, 2.825f, 1.067f, 3.163f, 2.5f)
            horizontalLineToRelative(2.837f)
            curveTo(21.664f, 6.5f, 22f, 6.836f, 22f, 7.25f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(21.25f, 8f)
            horizontalLineToRelative(-2.837f)
            curveToRelative(-0.339f, 1.434f, -1.626f, 2.5f, -3.163f, 2.5f)
            reflectiveCurveTo(12.426f, 9.434f, 12.087f, 8f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 8f, 2f, 7.664f, 2f, 7.25f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(2.75f, 6.5f)
            horizontalLineToRelative(9.337f)
            curveTo(12.425f, 5.067f, 13.713f, 4f, 15.25f, 4f)
            close()
        }
    }.build()
}
