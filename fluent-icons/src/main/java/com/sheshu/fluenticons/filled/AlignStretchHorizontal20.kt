package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignStretchHorizontal20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignStretchHorizontal20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 17.5f)
            curveTo(3f, 17.776f, 3.224f, 18f, 3.5f, 18f)
            reflectiveCurveTo(4f, 17.776f, 4f, 17.5f)
            verticalLineToRelative(-15f)
            curveTo(4f, 2.224f, 3.776f, 2f, 3.5f, 2f)
            reflectiveCurveTo(3f, 2.224f, 3f, 2.5f)
            verticalLineToRelative(15f)
            close()
            moveToRelative(13f, 0f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-15f)
            curveTo(17f, 2.224f, 16.776f, 2f, 16.5f, 2f)
            reflectiveCurveTo(16f, 2.224f, 16f, 2.5f)
            verticalLineToRelative(15f)
            close()
            moveTo(13f, 16f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(7f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(2f, -9f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(7f)
            curveTo(5.895f, 9f, 5f, 8.105f, 5f, 7f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1f)
            close()
        }
    }.build()
}
