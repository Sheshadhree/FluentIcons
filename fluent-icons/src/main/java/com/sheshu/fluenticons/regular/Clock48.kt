package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Clock48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Clock48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 5f)
            curveToRelative(10.493f, 0f, 19f, 8.507f, 19f, 19f)
            reflectiveCurveToRelative(-8.507f, 19f, -19f, 19f)
            reflectiveCurveTo(5f, 34.493f, 5f, 24f)
            reflectiveCurveTo(13.507f, 5f, 24f, 5f)
            close()
            moveToRelative(0f, 2.5f)
            curveTo(14.887f, 7.5f, 7.5f, 14.887f, 7.5f, 24f)
            reflectiveCurveTo(14.887f, 40.5f, 24f, 40.5f)
            reflectiveCurveTo(40.5f, 33.113f, 40.5f, 24f)
            reflectiveCurveTo(33.113f, 7.5f, 24f, 7.5f)
            close()
            moveTo(22.75f, 12f)
            curveToRelative(0.647f, 0f, 1.18f, 0.492f, 1.244f, 1.122f)
            lineTo(24f, 13.25f)
            verticalLineTo(24f)
            horizontalLineToRelative(6.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            curveToRelative(0f, 0.647f, -0.492f, 1.18f, -1.122f, 1.244f)
            lineTo(30.75f, 26.5f)
            horizontalLineToRelative(-8f)
            curveToRelative(-0.647f, 0f, -1.18f, -0.492f, -1.244f, -1.122f)
            lineTo(21.5f, 25.25f)
            verticalLineToRelative(-12f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            close()
        }
    }.build()
}
