package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabDesktopSearch16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabDesktopSearch16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 2f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(1.5f)
            curveTo(7f, 4.328f, 7.672f, 5f, 8.5f, 5f)
            horizontalLineTo(14f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-1.085f)
            curveToRelative(-0.073f, -0.205f, -0.19f, -0.397f, -0.354f, -0.56f)
            lineToRelative(-2f, -2f)
            curveTo(8.843f, 10.853f, 9f, 10.195f, 9f, 9.5f)
            curveTo(9f, 7.015f, 6.985f, 5f, 4.5f, 5f)
            curveTo(3.575f, 5f, 2.715f, 5.28f, 2f, 5.758f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveToRelative(8f, 0f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 4f, 8f, 3.776f, 8f, 3.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(4f)
            close()
            moveTo(4.5f, 13f)
            curveToRelative(0.786f, 0f, 1.512f, -0.26f, 2.096f, -0.697f)
            lineToRelative(2.55f, 2.55f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.707f, 0f)
            curveToRelative(0.196f, -0.195f, 0.196f, -0.511f, 0f, -0.707f)
            lineToRelative(-2.55f, -2.55f)
            curveTo(7.741f, 11.012f, 8f, 10.286f, 8f, 9.5f)
            curveTo(8f, 7.567f, 6.433f, 6f, 4.5f, 6f)
            reflectiveCurveTo(1f, 7.567f, 1f, 9.5f)
            reflectiveCurveTo(2.567f, 13f, 4.5f, 13f)
            close()
            moveToRelative(0f, -1f)
            curveTo(3.12f, 12f, 2f, 10.88f, 2f, 9.5f)
            reflectiveCurveTo(3.12f, 7f, 4.5f, 7f)
            reflectiveCurveTo(7f, 8.12f, 7f, 9.5f)
            reflectiveCurveTo(5.88f, 12f, 4.5f, 12f)
            close()
        }
    }.build()
}
