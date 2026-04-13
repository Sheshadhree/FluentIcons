package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Person16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Person16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 8f)
            curveTo(12.328f, 8f, 13f, 8.672f, 13f, 9.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.971f, -1.86f, 4f, -5f, 4f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineTo(9.5f)
            curveTo(3f, 8.672f, 3.672f, 8f, 4.5f, 8f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(-7f)
            curveTo(4.224f, 9f, 4f, 9.224f, 4f, 9.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.438f, 1.432f, 3f, 4f, 3f)
            reflectiveCurveToRelative(4f, -1.562f, 4f, -3f)
            verticalLineTo(9.5f)
            curveTo(12f, 9.224f, 11.776f, 9f, 11.5f, 9f)
            close()
            moveTo(8f, 1.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(9.519f, 7f, 8f, 7f)
            reflectiveCurveTo(5.25f, 5.769f, 5.25f, 4.25f)
            reflectiveCurveTo(6.481f, 1.5f, 8f, 1.5f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            reflectiveCurveTo(7.034f, 6f, 8f, 6f)
            reflectiveCurveToRelative(1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(8.966f, 2.5f, 8f, 2.5f)
            close()
        }
    }.build()
}
