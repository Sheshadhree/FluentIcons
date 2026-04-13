package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Storage24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Storage24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 7f)
            horizontalLineToRelative(14f)
            curveToRelative(1.598f, 0f, 2.904f, 1.249f, 2.995f, 2.824f)
            lineTo(22f, 10f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.598f, -1.249f, 2.904f, -2.824f, 2.995f)
            lineTo(19f, 17f)
            horizontalLineTo(5f)
            curveToRelative(-1.598f, 0f, -2.904f, -1.249f, -2.995f, -2.824f)
            lineTo(2f, 14f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.598f, 1.249f, -2.904f, 2.824f, -2.995f)
            lineTo(5f, 7f)
            horizontalLineToRelative(14f)
            horizontalLineTo(5f)
            close()
            moveToRelative(14f, 1.5f)
            horizontalLineTo(5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(14f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(18f, 10f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(-4f, 0f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
