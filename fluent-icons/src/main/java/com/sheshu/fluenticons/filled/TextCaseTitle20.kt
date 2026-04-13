package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextCaseTitle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextCaseTitle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 3.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(4.657f)
            curveTo(13.743f, 8.243f, 14.347f, 8f, 15f, 8f)
            curveToRelative(1.657f, 0f, 3f, 1.567f, 3f, 3.5f)
            reflectiveCurveTo(16.657f, 15f, 15f, 15f)
            curveToRelative(-0.653f, 0f, -1.257f, -0.243f, -1.75f, -0.657f)
            verticalLineTo(14.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
            moveTo(15f, 13.5f)
            curveToRelative(0.62f, 0f, 1.5f, -0.67f, 1.5f, -2f)
            reflectiveCurveToRelative(-0.88f, -2f, -1.5f, -2f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 2f)
            reflectiveCurveToRelative(0.88f, 2f, 1.5f, 2f)
            close()
            moveTo(6.495f, 3.25f)
            curveTo(6.81f, 3.255f, 7.089f, 3.456f, 7.193f, 3.754f)
            lineToRelative(3.652f, 10.5f)
            curveToRelative(0.136f, 0.39f, -0.07f, 0.818f, -0.462f, 0.954f)
            curveToRelative(-0.391f, 0.136f, -0.819f, -0.07f, -0.955f, -0.462f)
            lineTo(8.647f, 12.5f)
            horizontalLineTo(4.06f)
            lineTo(3.2f, 14.766f)
            curveToRelative(-0.147f, 0.387f, -0.58f, 0.582f, -0.967f, 0.435f)
            curveToRelative(-0.387f, -0.147f, -0.582f, -0.58f, -0.435f, -0.967f)
            lineToRelative(3.984f, -10.5f)
            curveTo(5.895f, 3.439f, 6.18f, 3.246f, 6.495f, 3.25f)
            close()
            moveTo(4.63f, 11f)
            horizontalLineToRelative(3.495f)
            lineTo(6.454f, 6.195f)
            lineTo(4.63f, 11f)
            close()
        }
    }.build()
}
