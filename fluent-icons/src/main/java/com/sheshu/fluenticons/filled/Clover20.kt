package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clover20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clover20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 2f)
            curveTo(3.567f, 2f, 2f, 3.567f, 2f, 5.5f)
            reflectiveCurveTo(3.567f, 9f, 5.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(8.776f, 9f, 9f, 8.776f, 9f, 8.5f)
            verticalLineToRelative(-3f)
            curveTo(9f, 3.567f, 7.433f, 2f, 5.5f, 2f)
            close()
            moveToRelative(0f, 15f)
            curveTo(3.567f, 17f, 2f, 15.433f, 2f, 13.5f)
            reflectiveCurveTo(3.567f, 10f, 5.5f, 10f)
            horizontalLineToRelative(3f)
            curveTo(8.776f, 10f, 9f, 10.224f, 9f, 10.5f)
            verticalLineToRelative(3f)
            curveTo(9f, 15.433f, 7.433f, 17f, 5.5f, 17f)
            close()
            moveToRelative(8f, -15f)
            curveTo(15.433f, 2f, 17f, 3.567f, 17f, 5.5f)
            reflectiveCurveTo(15.433f, 9f, 13.5f, 9f)
            horizontalLineToRelative(-3f)
            curveTo(10.224f, 9f, 10f, 8.776f, 10f, 8.5f)
            verticalLineToRelative(-3f)
            curveTo(10f, 3.567f, 11.567f, 2f, 13.5f, 2f)
            close()
            moveToRelative(0f, 15f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(15.433f, 10f, 13.5f, 10f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            close()
        }
    }.build()
}
