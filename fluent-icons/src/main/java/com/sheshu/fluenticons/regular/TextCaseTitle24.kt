package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextCaseTitle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextCaseTitle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.75f, 3f)
            curveTo(15.336f, 3f, 15f, 3.336f, 15f, 3.75f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-0.237f)
            curveTo(17.185f, 19.631f, 18.054f, 20f, 19f, 20f)
            curveToRelative(2.21f, 0f, 4f, -2.015f, 4f, -4.5f)
            reflectiveCurveTo(21.21f, 11f, 19f, 11f)
            curveToRelative(-0.946f, 0f, -1.815f, 0.37f, -2.5f, 0.987f)
            verticalLineTo(3.75f)
            curveTo(16.5f, 3.336f, 16.164f, 3f, 15.75f, 3f)
            close()
            moveToRelative(0.75f, 12.5f)
            curveToRelative(0f, -1.828f, 1.28f, -3f, 2.5f, -3f)
            reflectiveCurveToRelative(2.5f, 1.172f, 2.5f, 3f)
            reflectiveCurveToRelative(-1.28f, 3f, -2.5f, 3f)
            reflectiveCurveToRelative(-2.5f, -1.172f, -2.5f, -3f)
            close()
            moveTo(7.76f, 3f)
            curveToRelative(0.314f, 0.005f, 0.592f, 0.204f, 0.697f, 0.5f)
            lineToRelative(5.5f, 15.5f)
            curveToRelative(0.138f, 0.39f, -0.066f, 0.818f, -0.456f, 0.957f)
            curveToRelative(-0.39f, 0.138f, -0.82f, -0.066f, -0.958f, -0.456f)
            lineToRelative(-1.42f, -4.001f)
            horizontalLineTo(4.007f)
            lineTo(2.45f, 19.52f)
            curveToRelative(-0.15f, 0.388f, -0.584f, 0.58f, -0.97f, 0.43f)
            curveToRelative(-0.387f, -0.15f, -0.58f, -0.585f, -0.43f, -0.97f)
            lineToRelative(6f, -15.5f)
            curveTo(7.165f, 3.186f, 7.448f, 2.995f, 7.76f, 3f)
            close()
            moveTo(7.72f, 5.907f)
            lineTo(4.587f, 14f)
            horizontalLineToRelative(6.005f)
            lineTo(7.72f, 5.907f)
            close()
        }
    }.build()
}
