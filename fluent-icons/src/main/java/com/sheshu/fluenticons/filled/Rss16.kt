package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rss16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rss16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(3.119f, 2f, 2f, 3.119f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.881f, 3.119f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.381f, 0f, 2.5f, -1.119f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.119f, 12.881f, 2f, 11.5f, 2f)
            close()
            moveToRelative(-6f, 9.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(5.086f, 9.75f, 5.5f, 9.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            close()
            moveToRelative(3f, -0.25f)
            curveTo(8.224f, 11f, 8f, 10.776f, 8f, 10.5f)
            curveTo(8f, 9.121f, 6.879f, 8f, 5.5f, 8f)
            curveTo(5.224f, 8f, 5f, 7.776f, 5f, 7.5f)
            reflectiveCurveTo(5.224f, 7f, 5.5f, 7f)
            curveTo(7.43f, 7f, 9f, 8.57f, 9f, 10.5f)
            curveTo(9f, 10.776f, 8.776f, 11f, 8.5f, 11f)
            close()
            moveToRelative(3f, 0f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            curveTo(11f, 7.468f, 8.532f, 5f, 5.5f, 5f)
            curveTo(5.224f, 5f, 5f, 4.776f, 5f, 4.5f)
            reflectiveCurveTo(5.224f, 4f, 5.5f, 4f)
            curveTo(9.084f, 4f, 12f, 6.916f, 12f, 10.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            close()
        }
    }.build()
}
