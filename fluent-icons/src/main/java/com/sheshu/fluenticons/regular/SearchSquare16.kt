package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SearchSquare16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SearchSquare16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(5f, 7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            curveToRelative(0f, 0.552f, -0.223f, 1.052f, -0.586f, 1.414f)
            curveTo(8.052f, 8.777f, 7.552f, 9f, 7f, 9f)
            curveTo(5.895f, 9f, 5f, 8.105f, 5f, 7f)
            close()
            moveToRelative(2f, -3f)
            curveTo(5.343f, 4f, 4f, 5.343f, 4f, 7f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            curveToRelative(0.648f, 0f, 1.248f, -0.206f, 1.738f, -0.555f)
            lineToRelative(2.408f, 2.409f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(9.445f, 8.738f)
            curveTo(9.795f, 8.248f, 10f, 7.648f, 10f, 7f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
        }
    }.build()
}
