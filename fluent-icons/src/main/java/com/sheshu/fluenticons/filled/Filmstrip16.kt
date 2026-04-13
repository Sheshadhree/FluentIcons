package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Filmstrip16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Filmstrip16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 5.5f)
            curveTo(1f, 4.12f, 2.12f, 3f, 3.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(13.88f, 3f, 15f, 4.12f, 15f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.12f, 13f, 1f, 11.88f, 1f, 10.5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(11f, 0f)
            verticalLineToRelative(1f)
            curveTo(12f, 6.776f, 12.224f, 7f, 12.5f, 7f)
            reflectiveCurveTo(13f, 6.776f, 13f, 6.5f)
            verticalLineToRelative(-1f)
            curveTo(13f, 5.224f, 12.776f, 5f, 12.5f, 5f)
            reflectiveCurveTo(12f, 5.224f, 12f, 5.5f)
            close()
            moveTo(12.5f, 9f)
            curveTo(12.224f, 9f, 12f, 9.224f, 12f, 9.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-1f)
            curveTo(13f, 9.224f, 12.776f, 9f, 12.5f, 9f)
            close()
            moveTo(3f, 5.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 6.776f, 3.224f, 7f, 3.5f, 7f)
            reflectiveCurveTo(4f, 6.776f, 4f, 6.5f)
            verticalLineToRelative(-1f)
            curveTo(4f, 5.224f, 3.776f, 5f, 3.5f, 5f)
            reflectiveCurveTo(3f, 5.224f, 3f, 5.5f)
            close()
            moveTo(3.5f, 9f)
            curveTo(3.224f, 9f, 3f, 9.224f, 3f, 9.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 10.776f, 3.224f, 11f, 3.5f, 11f)
            reflectiveCurveTo(4f, 10.776f, 4f, 10.5f)
            verticalLineToRelative(-1f)
            curveTo(4f, 9.224f, 3.776f, 9f, 3.5f, 9f)
            close()
        }
    }.build()
}
