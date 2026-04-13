package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableInsertRow20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableInsertRow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 16f)
            curveTo(3.224f, 16f, 3f, 16.224f, 3f, 16.5f)
            reflectiveCurveTo(3.224f, 17f, 3.5f, 17f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.776f, 16f, 16.5f, 16f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(0f, -13f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            reflectiveCurveTo(3.224f, 4f, 3.5f, 4f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 4f, 17f, 3.776f, 17f, 3.5f)
            reflectiveCurveTo(16.776f, 3f, 16.5f, 3f)
            horizontalLineToRelative(-13f)
            close()
            moveTo(3f, 11f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(2f)
            verticalLineTo(7f)
            horizontalLineTo(5f)
            curveTo(3.895f, 7f, 3f, 7.895f, 3f, 9f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(9f, 2f)
            horizontalLineTo(8f)
            verticalLineTo(7f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(6f)
            close()
            moveToRelative(1f, 0f)
            verticalLineTo(7f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}
