package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle716: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle716",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 8f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            close()
            moveToRelative(5f, -3f)
            curveTo(5.724f, 5f, 5.5f, 5.224f, 5.5f, 5.5f)
            reflectiveCurveTo(5.724f, 6f, 6f, 6f)
            horizontalLineToRelative(3.005f)
            curveTo(8.86f, 6.216f, 8.7f, 6.472f, 8.531f, 6.763f)
            curveToRelative(-0.574f, 0.998f, -1.225f, 2.429f, -1.524f, 4.152f)
            curveToRelative(-0.047f, 0.272f, 0.136f, 0.53f, 0.408f, 0.578f)
            curveToRelative(0.272f, 0.047f, 0.53f, -0.136f, 0.578f, -0.408f)
            curveToRelative(0.273f, -1.577f, 0.871f, -2.896f, 1.405f, -3.823f)
            curveToRelative(0.266f, -0.463f, 0.514f, -0.825f, 0.694f, -1.07f)
            curveToRelative(0.09f, -0.123f, 0.163f, -0.216f, 0.213f, -0.277f)
            lineToRelative(0.056f, -0.067f)
            lineToRelative(0.012f, -0.016f)
            lineToRelative(0.003f, -0.002f)
            curveToRelative(0.129f, -0.148f, 0.16f, -0.358f, 0.08f, -0.536f)
            curveTo(10.373f, 5.114f, 10.195f, 5f, 10f, 5f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
