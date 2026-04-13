package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Phone28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Phone28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.75f, 2f)
            curveTo(8.231f, 2f, 7f, 3.231f, 7f, 4.75f)
            verticalLineToRelative(18.5f)
            curveTo(7f, 24.768f, 8.231f, 26f, 9.75f, 26f)
            horizontalLineToRelative(8.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.232f, 2.75f, -2.75f)
            verticalLineTo(4.75f)
            curveTo(21f, 3.231f, 19.769f, 2f, 18.25f, 2f)
            horizontalLineToRelative(-8.5f)
            close()
            moveTo(8.5f, 4.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-8.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(4.75f)
            close()
            moveTo(12.25f, 21f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(16.164f, 21f, 15.75f, 21f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
