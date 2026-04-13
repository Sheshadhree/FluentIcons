package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Compose16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Compose16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.25f, 3f)
            curveTo(8.664f, 3f, 9f, 3.336f, 9f, 3.75f)
            reflectiveCurveTo(8.664f, 4.5f, 8.25f, 4.5f)
            horizontalLineToRelative(-3.5f)
            curveTo(4.06f, 4.5f, 3.5f, 5.06f, 3.5f, 5.75f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-3.5f)
            curveTo(11.5f, 7.336f, 11.836f, 7f, 12.25f, 7f)
            reflectiveCurveTo(13f, 7.336f, 13f, 7.75f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-5.5f)
            curveTo(3.231f, 14f, 2f, 12.769f, 2f, 11.25f)
            verticalLineToRelative(-5.5f)
            curveTo(2f, 4.231f, 3.231f, 3f, 4.75f, 3f)
            horizontalLineToRelative(3.5f)
            close()
            moveToRelative(4.47f, -0.78f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(7.59f, 9.47f)
            lineTo(6f, 10f)
            lineToRelative(0.53f, -1.59f)
            lineToRelative(6.19f, -6.19f)
            close()
        }
    }.build()
}
