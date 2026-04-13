package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Oven20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Oven20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveTo(4f, 14f)
            verticalLineTo(8f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            close()
            moveToRelative(12f, -7f)
            horizontalLineTo(4f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1f)
            close()
            moveTo(6.75f, 6.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(7.164f, 4.75f, 6.75f, 4.75f)
            reflectiveCurveTo(6f, 5.086f, 6f, 5.5f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            close()
            moveToRelative(6.5f, 0f)
            curveTo(13.664f, 6.25f, 14f, 5.914f, 14f, 5.5f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(12.5f, 5.086f, 12.5f, 5.5f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            close()
            moveToRelative(-2.5f, -0.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(9.25f, 5.914f, 9.25f, 5.5f)
            reflectiveCurveTo(9.586f, 4.75f, 10f, 4.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            close()
            moveTo(6f, 9f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(6f)
            close()
            moveToRelative(0f, 5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(4f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
