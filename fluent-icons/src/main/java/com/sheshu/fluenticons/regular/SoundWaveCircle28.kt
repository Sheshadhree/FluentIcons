package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SoundWaveCircle28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SoundWaveCircle28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3.5f)
            curveTo(8.201f, 3.5f, 3.5f, 8.201f, 3.5f, 14f)
            reflectiveCurveTo(8.201f, 24.5f, 14f, 24.5f)
            reflectiveCurveTo(24.5f, 19.799f, 24.5f, 14f)
            reflectiveCurveTo(19.799f, 3.5f, 14f, 3.5f)
            close()
            moveTo(2f, 14f)
            curveTo(2f, 7.373f, 7.373f, 2f, 14f, 2f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(2f, 20.627f, 2f, 14f)
            close()
            moveToRelative(10.25f, -5f)
            curveTo(12.664f, 9f, 13f, 9.336f, 13f, 9.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-8.5f)
            curveTo(11.5f, 9.336f, 11.836f, 9f, 12.25f, 9f)
            close()
            moveTo(9.5f, 12.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(8f, 11.836f, 8f, 12.25f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3.5f)
            close()
            moveTo(15.75f, 11f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(15f, 16.664f, 15f, 16.25f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
            moveTo(20f, 9.75f)
            curveTo(20f, 9.336f, 19.664f, 9f, 19.25f, 9f)
            reflectiveCurveTo(18.5f, 9.336f, 18.5f, 9.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(20f, 18.664f, 20f, 18.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
