package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 16.25f)
            curveToRelative(0f, 0.414f, -0.335f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-7.5f)
            curveTo(3.336f, 17f, 3f, 16.664f, 3f, 16.25f)
            verticalLineToRelative(-7.5f)
            curveTo(3f, 8.334f, 3.336f, 8f, 3.75f, 8f)
            reflectiveCurveTo(4.5f, 8.334f, 4.5f, 8.75f)
            verticalLineToRelative(5.69f)
            lineTo(15.72f, 3.22f)
            curveToRelative(0.292f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(5.56f, 15.5f)
            horizontalLineToRelative(5.69f)
            curveToRelative(0.415f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            close()
        }
    }.build()
}
