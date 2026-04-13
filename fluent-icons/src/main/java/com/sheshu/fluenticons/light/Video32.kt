package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Video32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Video32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 5.5f)
            curveTo(4.015f, 5.5f, 2f, 7.515f, 2f, 10f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(12f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-1.484f)
            lineToRelative(4.021f, 3.097f)
            curveTo(28.238f, 24.549f, 30f, 23.681f, 30f, 22.146f)
            verticalLineTo(9.853f)
            curveToRelative(0f, -1.535f, -1.762f, -2.402f, -2.979f, -1.466f)
            lineTo(23f, 11.484f)
            verticalLineTo(10f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-12f)
            close()
            moveTo(22f, 12.495f)
            verticalLineTo(22f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-12f)
            curveTo(4.567f, 25.5f, 3f, 23.933f, 3f, 22f)
            verticalLineTo(10f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(12f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(2.495f)
            close()
            moveToRelative(1f, 6.759f)
            verticalLineToRelative(-6.508f)
            lineToRelative(4.631f, -3.566f)
            curveTo(28.191f, 8.75f, 29f, 9.148f, 29f, 9.853f)
            verticalLineToRelative(12.294f)
            curveToRelative(0f, 0.705f, -0.81f, 1.104f, -1.369f, 0.673f)
            lineTo(23f, 19.254f)
            close()
        }
    }.build()
}
