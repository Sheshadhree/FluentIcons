package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentRibbon24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentRibbon24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2.001f, 2f, 2.001f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(10.001f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(9f)
            verticalLineToRelative(-3.671f)
            curveToRelative(0.625f, -0.773f, 1f, -1.758f, 1f, -2.83f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            curveToRelative(-0.526f, 0f, -1.03f, 0.09f, -1.5f, 0.256f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.104f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(1.5f, 0.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.277f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(5.5f)
            lineToRelative(-6f, -6f)
            close()
            moveTo(9f, 15.502f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(2f, 17.435f, 2f, 15.502f)
            curveToRelative(0f, -1.934f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.566f, 3.5f, 3.5f)
            close()
            moveToRelative(-6f, 3.742f)
            verticalLineToRelative(3.044f)
            curveToRelative(0f, 0.633f, 0.765f, 0.95f, 1.212f, 0.503f)
            lineTo(5.5f, 21.503f)
            lineToRelative(1.288f, 1.288f)
            curveTo(7.235f, 23.238f, 8f, 22.92f, 8f, 22.288f)
            verticalLineToRelative(-3.044f)
            curveToRelative(-0.715f, 0.48f, -1.575f, 0.758f, -2.5f, 0.758f)
            reflectiveCurveTo(3.715f, 19.723f, 3f, 19.244f)
            close()
        }
    }.build()
}
