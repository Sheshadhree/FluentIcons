package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LinkMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LinkMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 8f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 12f, 9f, 11.664f, 9f, 11.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineTo(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(12.38f, 5.5f, 11f, 5.5f)
            horizontalLineTo(5f)
            curveTo(3.62f, 5.5f, 2.5f, 6.62f, 2.5f, 8f)
            curveToRelative(0f, 1.125f, 0.743f, 2.076f, 1.765f, 2.39f)
            curveToRelative(-0.16f, 0.468f, -0.25f, 0.966f, -0.263f, 1.484f)
            curveTo(2.276f, 11.431f, 1f, 9.864f, 1f, 8f)
            close()
            moveToRelative(14.998f, 0.126f)
            curveToRelative(-0.012f, 0.518f, -0.104f, 1.016f, -0.263f, 1.484f)
            curveTo(16.757f, 9.924f, 17.5f, 10.875f, 17.5f, 12f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(9f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveTo(7.62f, 9.5f, 9f, 9.5f)
            horizontalLineToRelative(1.25f)
            curveTo(10.664f, 9.5f, 11f, 9.164f, 11f, 8.75f)
            reflectiveCurveTo(10.664f, 8f, 10.25f, 8f)
            horizontalLineTo(9f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            curveToRelative(0f, -1.864f, -1.276f, -3.43f, -3.002f, -3.874f)
            close()
        }
    }.build()
}
