package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Clock32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Clock32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 8.5f)
            curveTo(16f, 8.224f, 15.776f, 8f, 15.5f, 8f)
            reflectiveCurveTo(15f, 8.224f, 15f, 8.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(20.776f, 16f, 20.5f, 16f)
            horizontalLineTo(16f)
            verticalLineTo(8.5f)
            close()
            moveTo(30f, 16f)
            curveToRelative(0f, 7.732f, -6.268f, 14f, -14f, 14f)
            reflectiveCurveTo(2f, 23.732f, 2f, 16f)
            reflectiveCurveTo(8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            close()
            moveToRelative(-1f, 0f)
            curveToRelative(0f, -7.18f, -5.82f, -13f, -13f, -13f)
            reflectiveCurveTo(3f, 8.82f, 3f, 16f)
            reflectiveCurveToRelative(5.82f, 13f, 13f, 13f)
            reflectiveCurveToRelative(13f, -5.82f, 13f, -13f)
            close()
        }
    }.build()
}
