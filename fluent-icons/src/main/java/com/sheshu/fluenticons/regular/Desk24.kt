package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Desk24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Desk24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.25f, 4f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineToRelative(11f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(8.5f)
            verticalLineToRelative(9.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(22f, 19.664f, 22f, 19.25f)
            verticalLineToRelative(-13f)
            curveTo(22f, 5.007f, 20.993f, 4f, 19.75f, 4f)
            horizontalLineTo(4.25f)
            close()
            moveTo(3.5f, 9.5f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(7.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(9.5f)
            close()
            moveToRelative(0f, -1.5f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(8f)
            horizontalLineToRelative(-17f)
            close()
            moveToRelative(2.25f, 3.5f)
            curveTo(5.336f, 11.5f, 5f, 11.836f, 5f, 12.25f)
            reflectiveCurveTo(5.336f, 13f, 5.75f, 13f)
            horizontalLineToRelative(2.5f)
            curveTo(8.664f, 13f, 9f, 12.664f, 9f, 12.25f)
            reflectiveCurveTo(8.664f, 11.5f, 8.25f, 11.5f)
            horizontalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
