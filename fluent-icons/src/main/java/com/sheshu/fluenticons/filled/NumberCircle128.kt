package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle128: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle128",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 14f)
            curveTo(2f, 7.373f, 7.373f, 2f, 14f, 2f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(2f, 20.627f, 2f, 14f)
            close()
            moveToRelative(13.5f, -5.75f)
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
