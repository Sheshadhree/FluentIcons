package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Storage24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Storage24",
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
            moveToRelative(13f, 3f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(-4f, 0f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}
