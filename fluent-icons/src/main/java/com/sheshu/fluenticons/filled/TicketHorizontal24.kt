package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TicketHorizontal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TicketHorizontal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.75f, 5f)
            curveTo(21.44f, 5f, 22f, 5.56f, 22f, 6.25f)
            verticalLineToRelative(2.259f)
            curveToRelative(0f, 0.393f, -0.304f, 0.72f, -0.697f, 0.748f)
            curveTo(19.87f, 9.358f, 18.75f, 10.555f, 18.75f, 12f)
            curveToRelative(0f, 1.445f, 1.12f, 2.642f, 2.553f, 2.743f)
            curveTo(21.696f, 14.771f, 22f, 15.097f, 22f, 15.491f)
            verticalLineToRelative(2.259f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 19f, 2f, 18.44f, 2f, 17.75f)
            verticalLineToRelative(-2.259f)
            curveToRelative(0f, -0.393f, 0.304f, -0.72f, 0.697f, -0.748f)
            curveTo(4.131f, 14.642f, 5.25f, 13.446f, 5.25f, 12f)
            reflectiveCurveTo(4.13f, 9.358f, 2.697f, 9.257f)
            curveTo(2.304f, 9.229f, 2f, 8.903f, 2f, 8.509f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.56f, 2.56f, 5f, 3.25f, 5f)
            horizontalLineToRelative(17.5f)
            close()
        }
    }.build()
}
