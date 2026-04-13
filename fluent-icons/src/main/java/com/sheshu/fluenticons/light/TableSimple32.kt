package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.TableSimple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.TableSimple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
            moveTo(16.5f, 28f)
            horizontalLineToRelative(8f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-8f)
            horizontalLineTo(16.5f)
            verticalLineTo(28f)
            close()
            moveToRelative(-1f, -11.5f)
            horizontalLineTo(4f)
            verticalLineToRelative(8f)
            curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
            horizontalLineToRelative(8f)
            verticalLineTo(16.5f)
            close()
            moveToRelative(1f, -1f)
            horizontalLineTo(28f)
            verticalLineToRelative(-8f)
            curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(11.5f)
            close()
            moveTo(15.5f, 4f)
            horizontalLineToRelative(-8f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(11.5f)
            verticalLineTo(4f)
            close()
        }
    }.build()
}
