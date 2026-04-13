package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Warning20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Warning20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.562f, 3.262f)
            curveToRelative(0.19f, -0.35f, 0.69f, -0.35f, 0.88f, 0f)
            lineToRelative(6.5f, 12f)
            curveToRelative(0.18f, 0.334f, -0.061f, 0.739f, -0.44f, 0.739f)
            horizontalLineTo(3.5f)
            curveToRelative(-0.379f, 0f, -0.62f, -0.405f, -0.44f, -0.738f)
            lineTo(9.563f, 3.262f)
            close()
            moveToRelative(1.758f, -0.476f)
            curveToRelative(-0.567f, -1.048f, -2.07f, -1.048f, -2.637f, 0f)
            lineToRelative(-6.502f, 12f)
            curveToRelative(-0.542f, 1f, 0.182f, 2.215f, 1.318f, 2.215f)
            horizontalLineToRelative(13.003f)
            curveToRelative(1.137f, 0f, 1.86f, -1.215f, 1.319f, -2.215f)
            lineToRelative(-6.5f, -12f)
            close()
            moveTo(10.5f, 7.5f)
            curveTo(10.5f, 7.224f, 10.276f, 7f, 10f, 7f)
            reflectiveCurveTo(9.5f, 7.224f, 9.5f, 7.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-4f)
            close()
            moveToRelative(0.25f, 6.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(9.586f, 13f, 10f, 13f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            close()
        }
    }.build()
}
