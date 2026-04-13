package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RibbonStar24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RibbonStar24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 21.245f)
            lineToRelative(0.002f, -6f)
            curveTo(15.632f, 16.342f, 13.892f, 17f, 12f, 17f)
            reflectiveCurveToRelative(-3.63f, -0.657f, -5f, -1.754f)
            lineToRelative(0.003f, 6f)
            curveToRelative(0f, 0.607f, 0.684f, 0.962f, 1.181f, 0.612f)
            lineToRelative(3.817f, -2.687f)
            lineToRelative(3.818f, 2.687f)
            curveToRelative(0.497f, 0.35f, 1.182f, -0.005f, 1.182f, -0.613f)
            close()
            moveTo(19f, 9f)
            curveToRelative(0f, -3.866f, -3.134f, -7f, -7f, -7f)
            reflectiveCurveTo(5f, 5.134f, 5f, 9f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            close()
            moveToRelative(-6.771f, -3.358f)
            lineToRelative(0.912f, 1.853f)
            lineToRelative(2.044f, 0.295f)
            curveToRelative(0.21f, 0.03f, 0.293f, 0.288f, 0.142f, 0.435f)
            lineToRelative(-1.479f, 1.44f)
            lineToRelative(0.35f, 2.036f)
            curveToRelative(0.035f, 0.209f, -0.184f, 0.368f, -0.37f, 0.269f)
            lineTo(12f, 11.008f)
            lineToRelative(-1.827f, 0.962f)
            curveToRelative(-0.187f, 0.099f, -0.406f, -0.06f, -0.37f, -0.269f)
            lineToRelative(0.35f, -2.035f)
            lineToRelative(-1.48f, -1.44f)
            curveTo(8.522f, 8.078f, 8.605f, 7.82f, 8.815f, 7.79f)
            lineToRelative(2.044f, -0.295f)
            lineToRelative(0.912f, -1.853f)
            curveToRelative(0.094f, -0.19f, 0.364f, -0.19f, 0.458f, 0f)
            close()
        }
    }.build()
}
