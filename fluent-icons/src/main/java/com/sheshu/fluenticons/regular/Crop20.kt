package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Crop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Crop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2.5f)
            curveTo(6f, 2.224f, 5.776f, 2f, 5.5f, 2f)
            reflectiveCurveTo(5f, 2.224f, 5f, 2.5f)
            verticalLineTo(5f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 5f, 2f, 5.224f, 2f, 5.5f)
            reflectiveCurveTo(2.224f, 6f, 2.5f, 6f)
            horizontalLineTo(5f)
            verticalLineToRelative(6.5f)
            curveTo(5f, 13.88f, 6.12f, 15f, 7.5f, 15f)
            horizontalLineTo(14f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 14f, 17.5f, 14f)
            horizontalLineToRelative(-10f)
            curveTo(6.672f, 14f, 6f, 13.328f, 6f, 12.5f)
            verticalLineToRelative(-10f)
            close()
            moveToRelative(8f, 5f)
            verticalLineTo(13f)
            horizontalLineToRelative(1f)
            verticalLineTo(7.5f)
            curveTo(15f, 6.12f, 13.88f, 5f, 12.5f, 5f)
            horizontalLineTo(7f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(5.5f)
            curveTo(13.328f, 6f, 14f, 6.672f, 14f, 7.5f)
            close()
        }
    }.build()
}
