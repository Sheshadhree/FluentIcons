package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NumberCircle128: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle128",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 14f)
            curveTo(3.5f, 8.201f, 8.201f, 3.5f, 14f, 3.5f)
            reflectiveCurveTo(24.5f, 8.201f, 24.5f, 14f)
            reflectiveCurveTo(19.799f, 24.5f, 14f, 24.5f)
            reflectiveCurveTo(3.5f, 19.799f, 3.5f, 14f)
            close()
            moveTo(14f, 2f)
            curveTo(7.373f, 2f, 2f, 7.373f, 2f, 14f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(20.627f, 2f, 14f, 2f)
            close()
            moveToRelative(1.5f, 6.25f)
            curveToRelative(0f, -0.376f, -0.279f, -0.694f, -0.651f, -0.743f)
            curveToRelative(-0.372f, -0.05f, -0.723f, 0.183f, -0.823f, 0.544f)
            lineToRelative(-0.004f, 0.014f)
            lineTo(14f, 8.134f)
            curveToRelative(-0.02f, 0.063f, -0.055f, 0.16f, -0.105f, 0.282f)
            curveToRelative(-0.1f, 0.245f, -0.26f, 0.587f, -0.499f, 0.966f)
            curveToRelative(-0.477f, 0.758f, -1.251f, 1.638f, -2.456f, 2.185f)
            curveToRelative(-0.377f, 0.172f, -0.544f, 0.616f, -0.373f, 0.993f)
            curveToRelative(0.172f, 0.377f, 0.616f, 0.544f, 0.993f, 0.373f)
            curveToRelative(1.064f, -0.484f, 1.857f, -1.165f, 2.44f, -1.846f)
            verticalLineToRelative(8.163f)
            curveToRelative(0f, 0.414f, 0.335f, 0.75f, 0.75f, 0.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-11f)
            close()
            moveToRelative(-1.474f, -0.199f)
            close()
        }
    }.build()
}
