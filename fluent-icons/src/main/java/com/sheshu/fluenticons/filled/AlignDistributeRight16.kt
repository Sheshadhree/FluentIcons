package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignDistributeRight16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignDistributeRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 1.5f)
            curveTo(15f, 1.224f, 14.776f, 1f, 14.5f, 1f)
            reflectiveCurveTo(14f, 1.224f, 14f, 1.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-13f)
            close()
            moveToRelative(-7f, 0f)
            curveTo(8f, 1.224f, 7.776f, 1f, 7.5f, 1f)
            reflectiveCurveTo(7f, 1.224f, 7f, 1.5f)
            verticalLineToRelative(13f)
            curveTo(7f, 14.776f, 7.224f, 15f, 7.5f, 15f)
            reflectiveCurveTo(8f, 14.776f, 8f, 14.5f)
            verticalLineToRelative(-13f)
            close()
            moveTo(3.5f, 13f)
            curveTo(2.672f, 13f, 2f, 12.328f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
            horizontalLineToRelative(1f)
            curveTo(5.328f, 3f, 6f, 3.672f, 6f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(6f, 12.328f, 5.328f, 13f, 4.5f, 13f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(9f, 9.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveTo(13f, 5.672f, 12.328f, 5f, 11.5f, 5f)
            horizontalLineToRelative(-1f)
            curveTo(9.672f, 5f, 9f, 5.672f, 9f, 6.5f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
