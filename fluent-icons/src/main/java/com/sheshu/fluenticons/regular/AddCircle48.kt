package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AddCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AddCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 6.5f)
            curveTo(14.335f, 6.5f, 6.5f, 14.335f, 6.5f, 24f)
            reflectiveCurveTo(14.335f, 41.5f, 24f, 41.5f)
            reflectiveCurveTo(41.5f, 33.665f, 41.5f, 24f)
            reflectiveCurveTo(33.665f, 6.5f, 24f, 6.5f)
            close()
            moveTo(4f, 24f)
            curveTo(4f, 12.954f, 12.954f, 4f, 24f, 4f)
            reflectiveCurveToRelative(20f, 8.954f, 20f, 20f)
            reflectiveCurveToRelative(-8.954f, 20f, -20f, 20f)
            reflectiveCurveTo(4f, 35.046f, 4f, 24f)
            close()
            moveToRelative(20f, -10f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-7.5f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineToRelative(-7.5f)
            horizontalLineToRelative(-7.5f)
            curveTo(14.56f, 25.25f, 14f, 24.69f, 14f, 24f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(7.5f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            close()
        }
    }.build()
}
