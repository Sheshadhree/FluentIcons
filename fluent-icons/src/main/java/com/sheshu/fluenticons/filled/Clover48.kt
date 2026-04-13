package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clover48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clover48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 4f)
            curveTo(8.253f, 4f, 4f, 8.253f, 4f, 13.5f)
            reflectiveCurveTo(8.253f, 23f, 13.5f, 23f)
            horizontalLineToRelative(8.25f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(13.5f)
            curveTo(23f, 8.253f, 18.747f, 4f, 13.5f, 4f)
            close()
            moveToRelative(-0.025f, 40f)
            curveTo(8.26f, 44f, 4f, 39.774f, 4f, 34.55f)
            curveToRelative(0f, -5.22f, 4.23f, -9.45f, 9.45f, -9.45f)
            horizontalLineToRelative(8.3f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(8.15f)
            curveToRelative(0f, 5.252f, -4.283f, 9.5f, -9.525f, 9.5f)
            close()
            moveTo(34.5f, 4f)
            curveToRelative(5.247f, 0f, 9.5f, 4.253f, 9.5f, 9.5f)
            reflectiveCurveTo(39.747f, 23f, 34.5f, 23f)
            horizontalLineToRelative(-8.25f)
            curveTo(25.56f, 23f, 25f, 22.44f, 25f, 21.75f)
            verticalLineTo(13.5f)
            curveTo(25f, 8.253f, 29.253f, 4f, 34.5f, 4f)
            close()
            moveToRelative(0f, 40f)
            curveToRelative(5.247f, 0f, 9.5f, -4.253f, 9.5f, -9.5f)
            reflectiveCurveTo(39.747f, 25f, 34.5f, 25f)
            horizontalLineToRelative(-8.25f)
            curveTo(25.56f, 25f, 25f, 25.56f, 25f, 26.25f)
            verticalLineToRelative(8.25f)
            curveToRelative(0f, 5.247f, 4.253f, 9.5f, 9.5f, 9.5f)
            close()
        }
    }.build()
}
