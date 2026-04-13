package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonBoard12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonBoard12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 1f)
            curveTo(1.895f, 1f, 1f, 1.895f, 1f, 3f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(3f)
            close()
            moveTo(2f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3f)
            curveTo(2.448f, 8f, 2f, 7.552f, 2f, 7f)
            verticalLineTo(3f)
            close()
            moveToRelative(1.268f, 7f)
            curveTo(3.613f, 10.598f, 4.26f, 11f, 5f, 11f)
            horizontalLineToRelative(2f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.74f, -0.402f, -1.387f, -1f, -1.732f)
            verticalLineTo(7f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(3.268f)
            close()
            moveTo(6f, 3.5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(1f, 2.25f)
            curveToRelative(0f, 0.75f, -0.5f, 1.5f, -2f, 1.5f)
            reflectiveCurveTo(3f, 6.5f, 3f, 5.75f)
            curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
            horizontalLineToRelative(2.5f)
            curveTo(6.664f, 5f, 7f, 5.336f, 7f, 5.75f)
            close()
        }
    }.build()
}
