package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabletLaptop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabletLaptop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 3f)
            curveTo(5.895f, 3f, 5f, 3.895f, 5f, 5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(7f)
            close()
            moveToRelative(10.5f, 11f)
            horizontalLineTo(14f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 14f, 17.5f, 14f)
            close()
            moveToRelative(-11f, 0f)
            curveTo(6.224f, 14f, 6f, 14.224f, 6f, 14.5f)
            reflectiveCurveTo(6.224f, 15f, 6.5f, 15f)
            horizontalLineToRelative(2f)
            curveTo(8.776f, 15f, 9f, 14.776f, 9f, 14.5f)
            reflectiveCurveTo(8.776f, 14f, 8.5f, 14f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(2f, 11f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(7f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-4f)
            close()
        }
    }.build()
}
