package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleUpLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleUpLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.149f, 7.144f)
            curveToRelative(0.047f, -0.047f, 0.101f, -0.082f, 0.16f, -0.106f)
            curveTo(7.368f, 7.013f, 7.432f, 7f, 7.5f, 7f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 7f, 13f, 7.224f, 13f, 7.5f)
            reflectiveCurveTo(12.776f, 8f, 12.5f, 8f)
            horizontalLineTo(8.707f)
            lineToRelative(4.147f, 4.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(8f, 8.707f)
            verticalLineTo(12.5f)
            curveTo(8f, 12.776f, 7.776f, 13f, 7.5f, 13f)
            reflectiveCurveTo(7f, 12.776f, 7f, 12.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.068f, 0.013f, -0.132f, 0.038f, -0.191f)
            curveToRelative(0.024f, -0.059f, 0.06f, -0.113f, 0.106f, -0.16f)
            lineTo(7.15f, 7.144f)
            close()
            moveTo(10f, 2f)
            curveToRelative(-4.418f, 0f, -8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            close()
            moveToRelative(-7f, 8f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            close()
        }
    }.build()
}
