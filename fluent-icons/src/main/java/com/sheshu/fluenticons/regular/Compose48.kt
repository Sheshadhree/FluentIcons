package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Compose48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Compose48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.75f, 8f)
            curveTo(27.44f, 8f, 28f, 8.56f, 28f, 9.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-14.5f)
            curveToRelative(-2.071f, 0f, -3.75f, 1.679f, -3.75f, 3.75f)
            verticalLineToRelative(21.5f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineToRelative(21.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineToRelative(-14.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveTo(40f, 20.56f, 40f, 21.25f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-21.5f)
            curveTo(8.798f, 42f, 6f, 39.202f, 6f, 35.75f)
            verticalLineToRelative(-21.5f)
            curveTo(6f, 10.798f, 8.798f, 8f, 12.25f, 8f)
            horizontalLineToRelative(14.5f)
            close()
            moveToRelative(13.116f, -1.634f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, 1.28f, 0f, 1.768f)
            lineTo(21.65f, 28.116f)
            lineTo(19f, 29f)
            lineToRelative(0.884f, -2.651f)
            lineTo(39.866f, 6.366f)
            close()
        }
    }.build()
}
