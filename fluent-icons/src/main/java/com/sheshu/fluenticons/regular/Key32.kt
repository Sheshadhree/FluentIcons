package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Key32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Key32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 12f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 24f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            curveToRelative(0f, 0.784f, 0.113f, 1.543f, 0.324f, 2.261f)
            lineTo(4.586f, 22f)
            curveTo(4.21f, 22.375f, 4f, 22.884f, 4f, 23.414f)
            verticalLineTo(26f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            close()
            moveToRelative(-1f, -12f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(2f)
            horizontalLineTo(6f)
            verticalLineToRelative(-2.586f)
            lineToRelative(8.178f, -8.178f)
            curveToRelative(0.28f, -0.28f, 0.368f, -0.699f, 0.225f, -1.068f)
            curveTo(14.143f, 13.497f, 14f, 12.766f, 14f, 12f)
            close()
        }
    }.build()
}
